package com.finance.finance.resource;

import com.finance.finance.data.document.Transaction;
import com.finance.finance.data.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transaction")
public class TransactionResource {

    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionResource(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @GetMapping
    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Transaction getTransaction(@PathVariable("id") Integer id) {
        Optional<Transaction> transaction = transactionRepository.findById(id);
        return transaction.get();
    }

}
