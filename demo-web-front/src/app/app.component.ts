import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'demo-web-front';
  message = '';
  err = '';

  constructor(private http: HttpClient) {
  }

  ngOnInit(): void {

  }

  test() {
    this.http.get('http://localhost:8080/test').subscribe(res => {
      console.log(res);
      this.message = JSON.stringify(res);
      this.err = '';
    }, err => {
      this.err = JSON.stringify(err);
      this.message = '';
    });
  }

}
