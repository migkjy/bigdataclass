/**
 * 
 */

function checkImageType(fileName){
	var pattern = /jpg|gif|png|jpeg/i;
	return fileName.match(pattern);
}

function getFileInfo(fullName){
	var fileName, imgsrc, getLink;
	var fileLink;

	/* 이미지이면 True  */
	if(checkImageType(fullName)){
		imgsrc = "/displayFile?fileName="+fullName;
		/*	기본이 스몰 아이콘이니깐, s_ 끝난 (UUID~~원본이름.png) 파읾명을 가져와라	*/
		fileLink = fullName.substr(14);
		
		/*	/2017/05/08/ 를 가져옴	*/
		var front = fullName.substr(0,12);
		/* fileLink와 같은데, 굳이 다시 지정  */
		var end = fullName.substr(14);
		
		/* (s_) 를 제외한 원본 파일명을 보여줘라	*/
		getLink = "/displayFile?fileName="+front+end;
		
	/* 일반 파일이라면 	*/
	}else{
		/* 평범한 파일 아이콘을 보여라 */
		imgsrc   = "/resources/dist/img/file.png";
		fileLink = fullName.substr(12);
		getLink  = "/displayFile?fileName="+fullName;
	}
	/* 기본파일은 이름 앞에 "_" 를 붙이게 되어 있다 (앞에서 s_를 지웟으니 그냥 사용됨) 	*/
	fileName = fileLink.substr(fileLink.indexOf("_")+1);
	
	return {  fileName  : fileName
		 	, imgsrc 	: imgsrc
		 	, getLink	: getLink
		 	, fullName	: fullName
		   };
}