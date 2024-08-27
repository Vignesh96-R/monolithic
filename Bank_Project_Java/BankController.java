package com.example.demo;

import java.util.Map.Entry;
import java.util.Optional;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.DAO;
@Controller
public class BankController {
	@Autowired
	private DAO dao;
	static long count=8812300000L;
@RequestMapping("ourbank")
public ModelAndView indexPage(UserEntry user) {
	ModelAndView mav=new ModelAndView();
	mav.addObject("userDetail",user);
	mav.setViewName("bank.jsp");
	return mav;
}
@RequestMapping("accountOpen")
public ModelAndView newAccount(UserEntry user) {
user.setAccountNumber(count++);
dao.save(user);
ModelAndView mav=new ModelAndView("display.jsp");
user=dao.findById(user.getAccountNumber()).orElse(new UserEntry());
mav.addObject("user", user);
return mav;
}

@RequestMapping("deposite")
public ModelAndView credit(UserEntry user) {
	ModelAndView mav=new ModelAndView("balance.jsp");
	long amount= user.getAmount();
	user=dao.findById(user.getAccountNumber()).orElse(new UserEntry());
	user.setData(amount);
	user.setBalance(user.getBalance()+amount);
	mav.addObject("useor", user);//the attribute "useor" is used in jsp file as${useor.}
	dao.save(user);		//if not save then old memory will be forget or loose
	return mav;
}

@RequestMapping("withdraw")
public ModelAndView debit(UserEntry user) {
	ModelAndView mav=new ModelAndView("balance.jsp");
	long amount= user.getAmount();
	user=dao.findById(user.getAccountNumber()).orElse(new UserEntry());
	user.setData(-amount);
	user.setBalance(user.getBalance()-amount);
	dao.save(user); 
	mav.addObject("useor", user);
	return mav;
}
@RequestMapping("balance")
public ModelAndView balance1(UserEntry user) {
	ModelAndView mav=new ModelAndView("balance.jsp");
	user=dao.findById(user.getAccountNumber()).orElse(new UserEntry());
	mav.addObject("useor",user);
	return mav;
}
@RequestMapping("transactionHistory")
public ModelAndView history(UserEntry user) {
	ModelAndView mav=new ModelAndView("tranHistory.jsp");
	user=dao.findById(user.getAccountNumber()).orElse(new UserEntry());
	String x="";
	for (Long m : user.getData()) {
	if(m>0) {
		x="c"+m.toString()+"\n"+x;
	}
	else if(0>m) {
		m=(-m);
		x="d"+m.toString()+"\n"+x;
	}
	}
	mav.addObject("usero", user);
	mav.addObject("useor", x);
	return mav;
}

	
	
}


