$("document").ready(function(){

    $("#signupUser").on("click",function(){

        let date = new Date().toISOString().slice(0,19); //getting current system date and time

        if($("#terms_accepted").is(":checked")){
            terms_Accepted = true;
        }

        let data = {
            email: $("#email").val().trim(),
            full_Name: $("#full_name").val().trim(),
            user_Name: $("#user_name").val().trim(),
            dob: $("#dob").val().trim(),
            country: $("#country").val().trim(),
            password: $("#password").val().trim(),
            confirm_Password: $("#confirm_password").val().trim(),
            terms_Accepted: terms_Accepted,
            join_Date: date
        }
            if(password !== confirm_password){
//                popup
            }
                $.ajax({
                    url: "/signupUser",
                    type: "POST",
                    contentType: "application/json",
                    data:JSON.stringify(data),

                    beforeSend: function(){
                        $("#signupUser").prop("disabled",true)
                        .text("stop");
                    }
                })

    })
})