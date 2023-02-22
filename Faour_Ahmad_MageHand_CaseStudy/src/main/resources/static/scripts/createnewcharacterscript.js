document.addEventListener("DOMContentLoaded", function() {
	
	const form = document.querySelector("form");
	form.addEventListener("submit", function(event) {
		
		event.preventDefault();
		const charactername = document.querySelector("cName").value;
		const characterclassname = document.querySelector("cClass").value;
		const characterrace = document.querySelector("cRace").value;
		const characteritems = document.querySelector("cScores").value;
		const characterspells = document.querySelector("cSpells").value;
		
		const charInfo = new FormData();
		charInfo.append("cName", cName);
		charInfo.append("cClass", cClass);
		charInfo.append("cRace", cRace);
		charInfo.append("cScores", cScores);
		charInfo.append("cItems", cItems);
		
		const request = new XMLHttpRequest();
		request.open("POST", form.action, true);
		request.onreadystatechange = function() {
			if(request.readyState === 4) {
				
				if(request.status === 200) {
					
					alert(request.responseText);
					window.location.href = "http://localhost:8080/index";
					
				} else {
					
					alert(request.responseText);
					
				}
				
			}