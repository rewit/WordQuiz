package com.biz.word.exec;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.biz.word.service.WordService;

public class WordExec_02 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/word/exec/word.txt";
		//메인에서 작성하면 파일이 바뀌더라도 Service를 변경하지 않고 main에서 변경 가능
		WordService ws;
		
		try {
			ws = new WordService(fileName);
			ws.inputWordList(); // 직접 코드에서 List 생성
			ws.readWordList();; //파일에서 직접 읽어서 list생성
			while (true) {
				ws.makeQuiz();
				if (ws.pickQuiz())
					break;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
