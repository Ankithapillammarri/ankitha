import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookByNameComponent } from './book-by-name.component';

describe('BookByNameComponent', () => {
  let component: BookByNameComponent;
  let fixture: ComponentFixture<BookByNameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookByNameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookByNameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
