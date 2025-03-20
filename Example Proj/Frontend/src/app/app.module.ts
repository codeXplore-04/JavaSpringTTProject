import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './services/login/login.component';
import { RegisterComponent } from './services/register/register.component';
import { HomeComponent } from './services/home/home.component';
import { DashboardComponent } from './services/dashboard/dashboard.component';
import { NavbarComponent } from './services/navbar/navbar.component';

import {Routes,RouterModule} from '@angular/router';
import { PagenotfoundComponent } from './services/pagenotfound/pagenotfound.component';
import { FormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';

const appRoutes: Routes =           
[
  {path:'',component:HomeComponent},
  {path:'login',component:LoginComponent},
  {path:'signup',component:RegisterComponent},
  {path:'dashboard',component:DashboardComponent},
  { path: '**', pathMatch: 'full',  
    component: PagenotfoundComponent }, 
];

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    DashboardComponent,
    NavbarComponent,
    PagenotfoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes),
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [NavbarComponent]
})
export class AppModule { }
