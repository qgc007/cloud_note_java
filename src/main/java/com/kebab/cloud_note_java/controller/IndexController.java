package com.kebab.cloud_note_java.controller;

import com.kebab.cloud_note_java.pojo.TbUser;
import com.kebab.cloud_note_java.service.impl.TbUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    TbUserServiceImpl tbUserServiceImpl;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name","spring");
        return "index";
    }

    @RequestMapping("/vue-test")
    public String testvue(){
        return "/testVue";
    }

    @RequestMapping("/vue-hello")
    public String testvuehello(){
        return "/testHelloWorld";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
       List<TbUser> users = tbUserServiceImpl.list();
       users.stream().forEach(x-> System.out.println(x.getUName()));
        return "this is a test!";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Goods[] getGoodsList() {

        Goods[] goodsList = new Goods[5];
        goodsList[0] = new Goods("GB0001", "JavaScript入門", "本");
        goodsList[1] = new Goods("GB0002", "Java SE Silver問題集", "本");
        goodsList[2] = new Goods("GB0002", "AWSコンテナ設計", "本");
        goodsList[3] = new Goods("GG0002", "エルデンリング", "ゲーム");
        goodsList[4] = new Goods("GG0002", "スプラトゥーン２", "ゲーム");

        return goodsList;
    }

    /**
     * 商品情報クラス
     */
    private class Goods{
        private String code;
        private String name;
        private String category;

        public Goods( String code, String name, String category){
            this.code = code;
            this.name = name;
            this.category = category;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }
    }
}
