package com.workpoint.mwallet.shared.requests;

import com.workpoint.mwallet.shared.model.UserDTO;
import com.workpoint.mwallet.shared.responses.BaseResponse;
import com.workpoint.mwallet.shared.responses.SaveUserResponse;

/**
 * 
 * @author duggan
 *
 */
public class SaveUserRequest extends BaseRequest<SaveUserResponse> {

	private UserDTO user;
	private boolean isDelete=false;

	@SuppressWarnings("unused")
	private SaveUserRequest() {
	}

	public SaveUserRequest(UserDTO user) {
		this.user = user;
	}

	public UserDTO getUser() {
		return user;
	}
	
	@Override
	public BaseResponse createDefaultActionResponse() {
	
		return new SaveUserResponse();
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}
}
