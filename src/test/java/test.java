import com.accp.DeZhaoWenApplication;
import com.accp.biz.liutao.biz;
import com.accp.dao.liutao.CompletionMapper;
import com.accp.dao.liutao.mrecordMapper;
import com.accp.dao.liutao.vehicleMapper;
import com.accp.pojo.liutao.Completion;
import com.accp.pojo.liutao.vehicle;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = DeZhaoWenApplication.class)
class test {
    @Autowired
    private CompletionMapper completionMapper;

    @Autowired
    private biz biz;

    @Test
    void ss(){
       biz.updateHgQualified("ER202002110005");
    }
}
