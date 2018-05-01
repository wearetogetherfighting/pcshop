package com.eb.pcshop.manager.web;

import com.eb.pcshop.manager.pojo.dto.PageDto;
import com.eb.pcshop.manager.pojo.po.Category;
import com.eb.pcshop.manager.pojo.po.MessageResult;
import com.eb.pcshop.manager.pojo.po.Product;
import com.eb.pcshop.manager.pojo.po.ProductCustom;
import com.eb.pcshop.manager.pojo.vo.ProductVO;
import com.eb.pcshop.manager.serviceInterface.ServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 孔泽琦 on 2018/4/13.
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {
    //即将使用logback的日志，成员变量
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ServiceInterface serviceInterface;

    /**
     * 跳转首页
     * @return
     */
    @RequestMapping("/index")
    public String toIndex() {
        return "indexManager";
    }

    @RequestMapping("/jsp/{pageName}")
    public String forwordOne(@PathVariable("pageName") String pageName) {
        return "product/"+pageName;
    }

    /**
     * 商品列表的分页展示
     * @param pageDto
     * @return
     */
    @ResponseBody
    @RequestMapping("/listProductByPage")
    public MessageResult<ProductCustom> listProductByPage(PageDto pageDto,ProductVO productVO) {
        MessageResult<ProductCustom>  messageResult=new MessageResult<>();
        Long i=0L;
        List<ProductCustom> list =new ArrayList<ProductCustom>();
        list = serviceInterface.listProductByPage(pageDto,productVO);
        i=serviceInterface.countProduct(productVO);
        messageResult.setCode(0);
        messageResult.setMsg("success");
        messageResult.setCount(i);
        messageResult.setData(list);
        return messageResult;
    }

    /**
     *
     * 批量删除
     * @param ids
     * @return
     */
    @ResponseBody
    @RequestMapping("/removeBatchProduct")
    public int removeBatchProduct(@RequestParam("ids[]") String [] ids) {
        int i=0;
        List<Integer> list=new ArrayList<>();
        for (int j = 0; j < ids.length; j++) {
            list.add(Integer.parseInt(ids[j]));
        }
        System.out.println("list:"+list);
        try {
            i = serviceInterface.removeBatchProduct(list);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 修改商品的上下架状态
     * @return
     */
    @ResponseBody
    @RequestMapping("/updatePutaway")
    public int updatePutaway(@RequestParam("pid") String pid) {
        int i=0;
        try {
           i = serviceInterface.updatePutaway(pid);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 删除单个商品
     * @return 受影响的行数
     */
    @ResponseBody
    @RequestMapping("/removeOne")
    public int removeOne(String pid) {
        int i = serviceInterface.removeOne(pid);
        return i;
    }

    @ResponseBody
    @RequestMapping("/listCategory")
    public List<Category> listCategory() {
        List<Category> list= new ArrayList<>();
        list = serviceInterface.listCategory();
        return list;
    }

    /**
     * 编辑商品
     * @param product
     * @return
     */
    @ResponseBody
    @RequestMapping("/editProduct")
    public int editProduct(Product product) {
        int i=0;
        i = serviceInterface.editProduct(product);
        System.out.println(product.getPname());
        return i;
    }

     @RequestMapping("/toEditProduct")
    public String toEditProduct(String pid,HttpServletRequest request) {
         Product product= serviceInterface.getProduct(pid);
         request.setAttribute("ProductMsg",product);
         return "product/editProduct";
    }

    /**
     * 添加商品
     * @param product
     * @return
     */
    @ResponseBody
    @RequestMapping("/addProduct")
    public int addProduct(Product product) {
        System.out.println("进入到addProduct方法");
        int i=0;
        try {
            i = serviceInterface.addProduct(product);
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }

    /**
     * 获取当前pid商品的信息
     * @param pid
     * @param session
     * @param
     */
    @RequestMapping("/currPid")
    public void currPid(String pid,HttpSession session) {
        Product product= serviceInterface.getProduct(pid);
        session.setAttribute("ProductMsg",product);
    }
}
