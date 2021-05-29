package com.example.firebaseemailaccount;

//사용자 계정 정보 모델 클래스(사용자가 로그인할 때 객체들을 어떤식으로 담아줄 것인지)

public class UserAccount {

    private String idToken; //Firebase Uid (고유 토큰정보)
    private String emailId; // 이메일 아이디
    private String password;    //비밀번호

    public UserAccount() {  }//클래스가 생성될 때 가장 먼저 호출되는 곳, 파이어베이스에서는 빈 생성자를 만들어주지 않으면 데이터베이스 조회 해올 때 오류남

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
