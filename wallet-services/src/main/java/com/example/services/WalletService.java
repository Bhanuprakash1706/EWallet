package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {
    @Autowired
    WalletRepository walletRepository;
    public Wallet createWallet(String userName) {
        Wallet wallet=Wallet.builder().amount(0).userName(userName).build();
        walletRepository.save(wallet);
        return wallet;
    }
    public Wallet incrementWallet(String userName,int amount){
        Wallet oldWallet=walletRepository.findByUserName(userName);
        oldWallet.setAmount(oldWallet.getAmount()+amount);
        walletRepository.save(oldWallet);
        return oldWallet;
    }
    public Wallet decrementWallet(String userName,int amount){
        Wallet oldWallet=walletRepository.findByUserName(userName);
        oldWallet.setAmount(oldWallet.getAmount()-amount);
        walletRepository.save(oldWallet);
        return oldWallet;
    }

    public Wallet getWallet(String userName) {
        Wallet wallet=walletRepository.findByUserName(userName);
        return wallet;
    }
}
