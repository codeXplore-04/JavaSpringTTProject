import { Component, inject } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  constructor(private router: Router) {}

  http = inject(HttpClient);
  userForm: UserData = {
    email: "",
    password: "",
  };
  public confirmPassword:String="";

  submitRegister(){

    if(this.confirmPassword!=this.userForm.password) {
      alert("Passwords are not same");
      return;
    }
    
    this.http.post("http://127.0.0.1:8090/api",this.userForm).subscribe((res:any)=>{
      console.log("User Created Successfully");
      if(res)
        this.router.navigate(['/login']);
      else
        alert("Registeration Failed");
      
    })
  }


}

interface UserData {
  email: string;
  password: string;
}