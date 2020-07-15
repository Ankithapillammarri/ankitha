import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookByIdComponent } from './book-by-id.component';

describe('BookByIdComponent', () => {
  let component: BookByIdComponent;
  let fixture: ComponentFixture<BookByIdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookByIdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookByIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
