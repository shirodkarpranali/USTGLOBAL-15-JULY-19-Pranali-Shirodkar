import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { NewsComponent } from './news/news.component';
import { HomeComponent } from './home/home.component';
import { MoviesComponent } from './movies/movies.component';
import { from } from 'rxjs';
import { FirebaseComponent } from './firebase/firebase.component';
import { UsersComponent } from './users/users.component';
import { CustomPipe } from './custom.pipe';
import { ReducePipe } from './reduce.pipe';
import { FilterPipe } from './filter.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NewsComponent,
    HomeComponent,
    MoviesComponent,
    FirebaseComponent,
    UsersComponent,
    CustomPipe,
    ReducePipe,
    FilterPipe,
    
  ],
  imports: [
    BrowserModule,HttpClientModule,
RouterModule.forRoot([
  { path:'', component:HomeComponent},
  { path:'news',component:NewsComponent},
  { path:'movies',component:MoviesComponent},
  { path:'firebase',component:FirebaseComponent},
  { path:'users',component:UsersComponent}
  
]),FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
