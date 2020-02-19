package com.accp.action.chengjun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.chengjun.UserBiz;
import com.accp.pojo.chengjun.Function;
import com.accp.pojo.chengjun.User;

@SuppressWarnings("all")
@RestController
@RequestMapping("/api/users")
public class UserAction {

	@Autowired
	private UserBiz userBiz;

	@GetMapping("loginIn/{name}/{pwd}")
	public Map<String, Object> loginIn(@PathVariable String name, @PathVariable String pwd, HttpSession session) {
		User user = userBiz.findUser(name, pwd);
		Map<String, Object> message = new HashMap<String, Object>();
		if (user != null) {
			session.setAttribute("USER", user);
			message.put("code", "200");
			message.put("msg", "ok");
			message.put("data", user);
		} else {
			message.put("code", "300");
			message.put("msg", "login_error");
		}

		return message;
	}

	@GetMapping("loginOut")
	public Map<String, Object> loginOut(HttpSession session) throws Exception {
		Map<String, Object> message = new HashMap<String, Object>();
		session.removeAttribute("USER");
		session.invalidate();// 立即失效
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}

	@GetMapping("getSessionUser")
	public User getUserInfo(HttpSession session) throws Exception {
		User user = (User) session.getAttribute("USER");
		return user;
	}

	@GetMapping("getFunTree")
	public List getUserFunTree(HttpSession session) {
		// 从session获得用户，以便得到权限
		User user = (User) session.getAttribute("USER");
		List tree = new ArrayList();
		Set<String> menuNames = new TreeSet<String>();// 剔除重复值，保存一级菜单名称
		for (Function fun : user.getRole().getFunctions()) {
			menuNames.add(fun.getParentFun().getFname());
		}
		// 遍历一级菜单名称，生成二级菜单项
		for (String name : menuNames) {
			// 节点【初始化】
			Map<String, Object> node = new HashMap<String, Object>();
			node.put("id", 0);//0:根级菜单
			node.put("text", name);
			List nodeChild = new ArrayList();
			for (Function fun : user.getRole().getFunctions()) {
				// 匹配是否是当前菜单的子项
				if (name.equals(fun.getParentFun().getFname())) {
					Map<String, Object> n = new HashMap<String, Object>();
					n.put("id", fun.getFcode());
					n.put("text", fun.getFname());
					nodeChild.add(n);
				}
			}
			node.put("children", nodeChild);
			tree.add(node);
		}
		return tree;
	}

}
