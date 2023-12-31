package ch26_socket.simpleGUI.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RequestBodyDto<T> {
	private String resource;       //resource: 명령(처리내용)
	private T body;
	
}
