package com.strutsdemo.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

@ParentPackage("basePackage")
@Action
@Namespace("/")
public class TestAction {
	 // http://localhost:8080/StrutsDemo/print!printSome.action
	@Action(value="print", results= {@Result(name="print", location="/page/print.jsp")})
	public String printSome(){
        System.out.println("TestAction printSome");
        return "print";
    }
	
}
