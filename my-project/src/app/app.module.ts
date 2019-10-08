import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import { AppComponent } from './app.component';
import { CarsComponent } from './cars/cars.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { ReceipesComponent } from './receipes/receipes.component';
import { ReceipesDetailsComponent } from './receipes-details/receipes-details.component';
import { NewsComponent } from './news/news.component';
import { NewsDetailsComponent } from './news-details/news-details.component';
import { NewssComponent } from './newss/newss.component';
import { NewssDetailComponent } from './newss-detail/newss-detail.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { MobilesDetailsComponent } from './mobiles-details/mobiles-details.component';
import { HeaderComponent } from './header/header.component';
import { from } from 'rxjs';

@NgModule({
  declarations: [
    AppComponent,
    CarsComponent,
    CarDetailsComponent,
    ReceipesComponent,
    ReceipesDetailsComponent,
    NewsComponent,
    NewsDetailsComponent,
    NewssComponent,
    NewssDetailComponent,
    MobilesComponent,
    MobilesDetailsComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
     {path:'cars', component: CarsComponent}, 
     {path:'receipes', component: ReceipesComponent} ,
     {path:'mobiles', component: MobilesComponent} ,
     {path:'news', component: NewsComponent} 
    ]
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
