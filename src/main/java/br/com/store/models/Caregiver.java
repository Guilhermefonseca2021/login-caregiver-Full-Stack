package br.com.store.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // notation to describe the class your be a table in database
public class Caregiver {
    @Id // here and below make describe the auto process from database to auto generate id in database.
    @GeneratedValue(strategy =  GenerationType.IDENTITY) 
    private Long id;
    // to describe a field in database
    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 15)
    private String phone;
    // in database by default length is 245.
    @Column(nullable = false)
    private String address;

    // our class model have to follow the pattern POJO
    public Caregiver() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    // the good practice is just generate the hascode equal "id" cause is unique data.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Caregiver other = (Caregiver) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Caregiver [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
    }

}
