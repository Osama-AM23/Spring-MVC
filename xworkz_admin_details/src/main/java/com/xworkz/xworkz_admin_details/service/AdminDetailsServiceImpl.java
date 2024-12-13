package com.xworkz.xworkz_admin_details.service;

import com.xworkz.xworkz_admin_details.dto.AdminDetailsDTO;
import com.xworkz.xworkz_admin_details.entity.AdminDetailsEntity;
import com.xworkz.xworkz_admin_details.repository.AdminDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.PrimitiveIterator;
import java.util.regex.Pattern;

@Service
public class AdminDetailsServiceImpl implements AdminDetailsService {
    @Autowired
    private AdminDetailsRepository repository;

    AdminDetailsEntity entity= new AdminDetailsEntity();

    public AdminDetailsServiceImpl() {
        System.out.println("No-Args Const of AdminDetailsServiceImpl");
    }

    @Override
    public boolean validateAndLogin(AdminDetailsDTO dto) {

        System.out.println("Executing validateAndLogin in ServiceImpl");
        boolean check = true;

        if (dto != null) {

            String name = dto.getName();
            if (name != null && name.length() >= 10 && name.matches("[a-zA-Z\\s]*$")) {
                System.out.println("Name is Valid");

            } else {
                System.out.println("Name is In-Valid");
                check = false;
            }

            int age = dto.getAge();
            if (age > 18) {
                System.out.println("Age is Valid");
            } else {
                System.out.println("Age is In-Valid");
                check = false;
            }

            String email = dto.getEmail();
            if (email != null && email.contains("@") && email.endsWith(".com")) {
                System.out.println("Email is Valid");
            } else {
                System.out.println("Email is In-Valid");
                check = false;
            }

            String password = dto.getPassword();
            boolean hasSpecialChar = password.matches(".*[^a-zA-Z0-9].*");

            if (password.length() >= 7 && hasSpecialChar) {
                System.out.println("Password is Valid");
            } else {
                System.out.println("Password is In-Valid");
                check = false;
            }


            String confirmPassword = dto.getConfirmPassword();
            if (confirmPassword != null && confirmPassword.equals(password)) {
                System.out.println("Confirm password is Valid");
            } else {
                System.out.println("Confirm Password is In-Valid");
                check=false;
            }

            String phone = dto.getPhone();
            if (phone.startsWith("9") && phone.length() >= 10) {
                System.out.println("Phone Number is Valid");
            } else {
                System.out.println("Phone Number is In-Valid");
                check=false;
            }

        }
        if(check){
            entity.setName(dto.getName());
            entity.setAge(dto.getAge());
            entity.setEmail(dto.getEmail());
            entity.setPassword(dto.getPassword());
            entity.setConfirmPassword(dto.getConfirmPassword());
            entity.setPhone(dto.getPhone());
            repository.onSend(entity);
        }

        return check;
    }
}
