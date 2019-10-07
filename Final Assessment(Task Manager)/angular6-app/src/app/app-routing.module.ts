import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddComponent } from './add/add.component';
import { ShowAllComponent } from './show-all/show-all.component';
import { EditComponent } from './edit/edit.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


const routes: Routes = [{path:"", component: AddComponent},
{path:"edit" , component: EditComponent},
{path:"show", component: ShowAllComponent},
{path:"**", component: PageNotFoundComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
