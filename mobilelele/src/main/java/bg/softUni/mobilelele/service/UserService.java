package bg.softUni.mobilelele.service;

import bg.softUni.mobilelele.model.service.UserLoginServiceModel;
import bg.softUni.mobilelele.model.service.UserRegistrationServiceModel;

public interface UserService {

    void initializeUsersAndRoles();

    boolean login(UserLoginServiceModel loginServiceModel);

    void logout();

    void registerAndLoginUser(UserRegistrationServiceModel userRegistrationServiceModel);

    boolean isUserNameFree(String username);
}
