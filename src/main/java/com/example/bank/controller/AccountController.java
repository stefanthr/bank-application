package com.example.bank.controller;

import com.example.bank.jpa.model.Account;
import com.example.bank.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
@AllArgsConstructor
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/list")
    public String listAllAccounts(Model model) {
        String result;
        if (!accountService.getAccounts().isEmpty()) {
            model.addAttribute("accounts", accountService.getAccounts());
            result = "accounts";
        } else {
            result = "no-accounts";
        }
        return result;
    }

    @GetMapping("/add")
    public String addAccountForm(@ModelAttribute Account account, Model model) {
        model.addAttribute("account", account);
        return "account-add";
    }

    @PostMapping("/add")
    public String addAccountSubmit(@ModelAttribute Account account) {
        accountService.addAccount(account);
        return "redirect:/account/list";
    }

}
