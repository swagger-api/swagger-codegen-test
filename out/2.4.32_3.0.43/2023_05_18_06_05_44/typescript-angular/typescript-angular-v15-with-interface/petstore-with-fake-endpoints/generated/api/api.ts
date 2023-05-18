export * from './anotherFake.service';
import { AnotherFakeService } from './anotherFake.service';
export * from './anotherFake.serviceInterface'
export * from './fake.service';
import { FakeService } from './fake.service';
export * from './fake.serviceInterface'
export * from './fakeClassnameTags123.service';
import { FakeClassnameTags123Service } from './fakeClassnameTags123.service';
export * from './fakeClassnameTags123.serviceInterface'
export * from './pet.service';
import { PetService } from './pet.service';
export * from './pet.serviceInterface'
export * from './store.service';
import { StoreService } from './store.service';
export * from './store.serviceInterface'
export * from './user.service';
import { UserService } from './user.service';
export * from './user.serviceInterface'
export const APIS = [AnotherFakeService, FakeService, FakeClassnameTags123Service, PetService, StoreService, UserService];
