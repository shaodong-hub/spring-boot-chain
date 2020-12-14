package com.github.chain.pojo;

import com.github.chain.constraint.Username;
import lombok.Data;

/**
 * @author 石少东
 * @date 2020-10-12 15:28
 * @since 1.0
 */

@Data
public class DataDTO {

    @Username
    private String username;

}
