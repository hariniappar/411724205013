const input = document.getElementById("messageInput");
const charCount = document.getElementById("charCount");
const addBtn = document.getElementById("addBtn");
const clearBtn = document.getElementById("clearBtn");
const messageList = document.getElementById("messageList");
const status = document.getElementById("status");

let messages = [];
input.addEventListener("input", function () {
    charCount.textContent = input.value.length;
});
function displayMessages() {
    messageList.innerHTML = "";

    messages.forEach((msg, index) => {
        let div = document.createElement("div");
        div.textContent = msg;
        messageList.appendChild(div);

        setTimeout(() => {
            if (messages[index] === msg) {
                messages.splice(index, 1);
                displayMessages();
                status.textContent = "Message Expired";
            }
        }, 10000);
    });
}

addBtn.addEventListener("click", function () {

    let promise = new Promise((resolve, reject) => {

        if (input.value.trim().length >= 3) {
            resolve(input.value);
        } else {
            reject(" PROMISE REJECT !!Message must contain at least 3 characters");
        }
    });

    promise.then((message) => {
        messages.push(message);
        displayMessages();
        status.textContent = "Message Added Successfully";
        input.value = "";
        charCount.textContent = 0;
    })

    .catch((error) => {
        status.textContent = error;
    });

});

// Clear All Messages
clearBtn.addEventListener("click", function () {
    messages = [];
    messageList.innerHTML = "";
    status.textContent = "All Messages Cleared";
});