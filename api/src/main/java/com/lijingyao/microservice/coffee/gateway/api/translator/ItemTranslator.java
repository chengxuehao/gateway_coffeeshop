package com.lijingyao.microservice.coffee.gateway.api.translator;

import com.lijingyao.microservice.coffee.gateway.api.base.BaseTranslator;
import com.lijingyao.microservice.coffee.gateway.api.translator.clients.ItemClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lijingyao on 2018/7/9 18:56.
 */
@Component
public class ItemTranslator extends BaseTranslator {

    @Autowired
    private ItemClient itemClient;




}
