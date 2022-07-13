'use strict';

const output = document.getElementById('output');

document.getElementById('birdForm').addEventListener("submit", function (event) {
    event.preventDefault();

    const form = event.target;

    const bird = {
        name: form.birdName.value,
        age: form.birdAge.value,
        species: form.birdSpecies.value,
    }

    axios.post("/createBird", bird)
        .then(res => {
            console.log("RESPONSE: ", res);
            form.birdName.focus();
            form.reset();
            renderBirds();
        })
        .catch(err => console.error(err));

    console.log("bird: ", bird);
});

function renderBirds() {
    axios.get("/getBirds")
        .then(res => {
            console.log("birdS: ", res.data);
            output.innerHTML = "";
            for (let bird of res.data) {
                const birdCol = document.createElement("div");
                birdCol.className = "col";

                const birdCard = document.createElement("div");
                birdCard.className = "card";
                birdCol.appendChild(birdCard);

                const birdDiv = document.createElement("div");
                birdDiv.className = "card-body";
                birdCard.appendChild(birdDiv);

                const birdName = document.createElement("h2");
                birdName.innerText = bird.name;
                birdDiv.appendChild(birdName);

                const birdAge = document.createElement("p");
                birdAge.innerText = bird.age + " years old.";
                birdDiv.appendChild(birdAge);

                const birdSpecies = document.createElement("p");
                birdSpecies.innerText = bird.species;
                birdSpecies.classList.add("btn", "btn-alert");
                birdDiv.appendChild(dinoSpecies);

                const birdDelete = document.createElement("button");
                birdDelete.innerText = "DESTROY";
                birdDelete.addEventListener("click", function () {
                    deleteBird(bird.id);
                });

                birdDiv.appendChild(birdDelete);

                output.appendChild(birdCol);
            }
        })
        .catch(err => console.error(err));
}

function deleteBird(id) {
    axios.delete("/removeBird/" + id)
        .then(res => {
            console.log(res);
            renderBirds();
        })
        .catch(err => console.error(err));
}


renderBirds();