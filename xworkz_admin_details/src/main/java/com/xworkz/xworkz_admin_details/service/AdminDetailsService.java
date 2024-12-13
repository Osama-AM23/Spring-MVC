package com.xworkz.xworkz_admin_details.service;

import com.xworkz.xworkz_admin_details.dto.AdminDetailsDTO;

public interface AdminDetailsService {

    public boolean validateAndLogin(AdminDetailsDTO dto);

}
