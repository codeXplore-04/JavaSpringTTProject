import { HttpClient } from '@angular/common/http';
import { Component, inject } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor(private router : Router){};
  
  http=inject(HttpClient);
  userForm: UserData = {
    email: "",
    password: ""
  };

  submitLogin() {
    console.log("data");
    this.http.post("http://127.0.0.1:8090/api/login",this.userForm).subscribe((res:any)=>{
      console.log(res);
      if(res == true) {
        this.router.navigate(["/dashboard"]);
      }
      else alert("Login Error");
    })
  }


}

interface UserData {
  email: string;
  password: string;
}