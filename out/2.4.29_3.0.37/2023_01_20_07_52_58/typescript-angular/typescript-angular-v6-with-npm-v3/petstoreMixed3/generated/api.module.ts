import { NgModule, ModuleWithProviders, SkipSelf, Optional } from '@angular/core';
import { Configuration } from './configuration';
import { HttpClient } from '@angular/common/http';


import { AnimalService } from './api/animal.service';
import { AnotherFakeService } from './api/anotherFake.service';
import { DogService } from './api/dog.service';
import { FakeService } from './api/fake.service';
import { FakeClassnameTags123Service } from './api/fakeClassnameTags123.service';
import { MasterService } from './api/master.service';
import { ParrotService } from './api/parrot.service';
import { PetService } from './api/pet.service';
import { StoreService } from './api/store.service';
import { UserService } from './api/user.service';

@NgModule({
  imports:      [],
  declarations: [],
  exports:      [],
  providers: [
    AnimalService,
    AnotherFakeService,
    DogService,
    FakeService,
    FakeClassnameTags123Service,
    MasterService,
    ParrotService,
    PetService,
    StoreService,
    UserService ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): ModuleWithProviders {
        return {
            ngModule: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( @Optional() @SkipSelf() parentModule: ApiModule,
                 @Optional() http: HttpClient) {
        if (parentModule) {
            throw new Error('ApiModule is already loaded. Import in your base AppModule only.');
        }
        if (!http) {
            throw new Error('You need to import the HttpClientModule in your AppModule! \n' +
            'See also https://github.com/angular/angular/issues/20575');
        }
    }
}
