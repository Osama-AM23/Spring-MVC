package com.xworkz.curdOperation.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pg_table")
@Data
@NoArgsConstructor

@NamedQuery(name = "updateByid", query = "UPDATE PgEntity pe SET pe.guestName = :byGuestName WHERE pe.id = :byId")
@NamedQuery(name = "getData", query = "SELECT pe.guestName FROM PgEntity pe WHERE pe.rent = :rent")
@NamedQuery(name = "getSingleDetail", query="Select pe From PgEntity pe where pe.id= :byId")
@NamedQuery(name = "deleteData", query = "Delete from PgEntity pe where pe.guestName = :byname")
public class PgEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "guest_name")
    private String guestName;
    @Column(name = "phone_no")
    private long phoneNo;
    @Column(name = "location")
    private String location;
    @Column(name = "room_type")
    private String roomType;
    @Column(name = "rent")
    private double rent;


    public PgEntity(String guestName, long phoneNo, String location, String roomType, double rent) {
        this.guestName = guestName;
        this.phoneNo = phoneNo;
        this.location = location;
        this.roomType = roomType;
        this.rent = rent;
    }
}
