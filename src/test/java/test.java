import com.accp.DeZhaoWenApplication;
import com.accp.dao.liutao.PcstatusMapper;
import com.accp.pojo.liutao.Pcstatus;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = DeZhaoWenApplication.class)
class test {

    @Autowired
    private PcstatusMapper pcstatusMapper;
    @Test
    void ss(){
        List<Pcstatus> pcstatuses = pcstatusMapper.qAllS();
        System.out.println(JSON.toJSONString(pcstatuses));
    }
}
