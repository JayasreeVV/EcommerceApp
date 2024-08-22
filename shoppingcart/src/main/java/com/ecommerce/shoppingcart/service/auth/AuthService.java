package com.ecommerce.shoppingcart.service.auth;

import com.ecommerce.shoppingcart.dto.SignUpRequest;
import com.ecommerce.shoppingcart.dto.UserDto;

public interface AuthService{
    UserDto createUser(SignUpRequest signUpRequest);
    public Boolean hasUserWithEmail(String email);

}
