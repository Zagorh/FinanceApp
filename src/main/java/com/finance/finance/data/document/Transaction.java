package com.finance.finance.data.document;

import com.finance.finance.util.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(Constants.TRANSACTIONS_COLLECTION)
@ToString
@Builder
@AllArgsConstructor
public class Transaction {

    private Long id;
    private Date transactionDate;
    private String payee;
    private String status;
    private Category category;
    private SubCategory subCategory;
    private String notes;

}
