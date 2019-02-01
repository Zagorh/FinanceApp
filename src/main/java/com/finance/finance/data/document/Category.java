package com.finance.finance.data.document;

import com.finance.finance.util.Constants;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(Constants.CATEGORIES_COLLECTION)
public class Category {

    @Id
    private Integer id;
    private String name;

}
