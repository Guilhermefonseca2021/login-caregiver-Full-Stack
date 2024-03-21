package br.com.store.dto;

public class CaregiverForm {
    private String name;
    private String phone;
    private String cpf;
    public CaregiverForm() {}
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
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return "CaregiverForm [name=" + name + ", phone=" + phone + ", cpf=" + cpf + "]";
    }
}
