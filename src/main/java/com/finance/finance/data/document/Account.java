package com.finance.finance.data.document;

import com.finance.finance.util.Constants;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(Constants.ACCOUNTS_COLLECTION)
public class Account {

    @Id
    private Integer id;
    private String name;

}
