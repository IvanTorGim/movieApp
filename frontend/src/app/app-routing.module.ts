import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MoviesComponent } from './components/movies/movies.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
    {path: '', redirectTo: 'movies', pathMatch: 'full'},
    {path: 'movies', component: MoviesComponent},
    {path: 'login', component: LoginComponent}

];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule { }