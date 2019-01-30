package com.finance.finance.data.document;

import com.finance.finance.util.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(Constants.PAYEES_COLLECTION)
@ToString
@Builder
@AllArgsConstructor
public class Payee {

    @Id
    private Integer id;
    private String name;

}
