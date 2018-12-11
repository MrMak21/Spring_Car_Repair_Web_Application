package com.carshoprepair.carshop.controller.mappers;

import com.carshoprepair.carshop.form.RegisterForm;
import com.carshoprepair.carshop.models.PersonModel;
import org.springframework.stereotype.Component;

@Component
public class RegisterFormToUserMapper {

    public PersonModel mapToUserModel(RegisterForm registerForm) {
        PersonModel personModel = new PersonModel();
        personModel.setFirstName(registerForm.getFirstName());
        personModel.setLastName(registerForm.getLastName());
        personModel.setEmail(registerForm.getEmail());
        personModel.setPassword(registerForm.getPassword());
        personModel.setAddress(registerForm.getAddress());
        personModel.setCarModel(registerForm.getCarModel());
        personModel.setPlate(registerForm.getPlate());
        personModel.setAfm(registerForm.getAfm());

        return personModel;
    }
}
