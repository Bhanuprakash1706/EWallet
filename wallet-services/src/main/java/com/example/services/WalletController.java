package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WalletController {
    @Autowired
    WalletService walletService;
    ///////////////////////////////////////////
    @PostMapping("/wallet")
    public Wallet createWallet(@RequestParam("userName")String userName){
        return walletService.createWallet(userName);
    }
    ///////////////////////////////////////////
    @GetMapping("/wallet")
    public Wallet getWallet(@RequestParam("userName")String userName){
        return walletService.getWallet(userName);
    }
    ///////////////////////////////////////////
    @PutMapping("/credit")
    public void creditMoney(@RequestParam("userName")String userName,@RequestParam("amt")int amount){
        walletService.incrementWallet(userName,amount);
    }
    ///////////////////////////////////////////
    @PutMapping("/debit")
    public void debitMoney(@RequestParam("userName")String userName,@RequestParam("amt")int amount){
        walletService.decrementWallet(userName,amount);
    }
}
