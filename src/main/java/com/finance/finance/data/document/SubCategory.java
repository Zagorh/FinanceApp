package com.finance.finance.data.document;

import com.finance.finance.util.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(Constants.CATEGORIES_COLLECTION)
@ToString
@Builder
@AllArgsConstructor
public class SubCategory {

    @Id
    private Integer id;
    private String name;
    private Category category;

}
