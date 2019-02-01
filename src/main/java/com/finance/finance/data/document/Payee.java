package com.finance.finance.data.document;

import com.finance.finance.util.Constants;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(Constants.PAYEES_COLLECTION)
public class Payee {

    @Id
    private Integer id;
    private String name;
    private String description;

}
