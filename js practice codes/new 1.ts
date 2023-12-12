
student:string[]={
"kishore","kumar","kota"
}

deleteStudent(data:string){
	const index=student.indexOf(data);
	student.splice(index);
}

deleteStudent("kota")

