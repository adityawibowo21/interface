public class loginuser {
    public double kodesepatu;
    private String username;
    private String password;
    public int data=0;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void cek(){
        if(data==1){
            if(username.equals("Admin") && password.equals("12345")){
                System.out.println("\nLogin Sukses");
            }else{
                System.out.print("\nLogin Gagal");
            }
        }
        else {
            if (username.equals("Aditya") && password.equals("210505")) {
                System.out.println("\nLogin Sukses");
            } else {
                System.out.print("\nLogin Gagal");
            }
        }
    }
}
