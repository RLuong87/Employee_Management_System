package employee.management.payloads.response;

import java.util.List;

public class LoginResponse {

    private String token;
    private String name;
    private List<String> roles;

    public LoginResponse(String token, String name, List<String> roles) {
        this.token = token;
        this.name = name;
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
