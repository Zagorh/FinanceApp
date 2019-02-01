package com.finance.finance.data.document;

import com.finance.finance.util.Constants;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(Constants.TRANSACTIONS_COLLECTION)
public class Transaction {

    @Id
    private Integer id;
    private Date transactionDate;
    private String payee;
    private String status;
    private Category category;
    private SubCategory subCategory;
    private String notes;

}
