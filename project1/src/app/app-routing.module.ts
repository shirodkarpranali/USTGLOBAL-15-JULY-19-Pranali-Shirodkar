import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { SportsComponent } from './sports/sports.component';
import { EntertainmentComponent } from './entertainment/entertainment.component';
import { HealthComponent } from './health/health.component';
import { BusinessComponent } from './business/business.component';
import { ScienceComponent } from './science/science.component';
import { TechnologyComponent } from './technology/technology.component';


const routes: Routes = [{ path:'', component:HomeComponent},
{ path:'sports',component:SportsComponent},
{ path:'entertainment',component:EntertainmentComponent},
{ path:'health',component:HealthComponent},
{ path:'business',component:BusinessComponent},
{ path:'science',component:ScienceComponent},
{ path:'technology',component:TechnologyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
