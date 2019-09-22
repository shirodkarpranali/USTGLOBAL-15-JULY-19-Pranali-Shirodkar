import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { ViewComponent } from './view/view.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


const routes: Routes = [{path : '', component: AddComponent},
{path : 'view', component: ViewComponent},
{path : '**' , component: PageNotFoundComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
