document.addEventListener('DOMContentLoaded', function () {
    const playListList = document.getElementById('playList-list');

    fetch('http://localhost:8080/api/playlist')  // Ensure this matches your backend endpoint
        .then(response => response.json())
        .then(data => {
            data.forEach(playList => {
                const playListElement = document.createElement('div');
                playListElement.innerHTML = `
                    <h3>${playList.title}</h3>
                    <h4>${playList.description}</h4>
                    <iframe width="560" height="315"
                            src="https://www.youtube.com/embed/videoseries?list=${playList.playlistId}"
                            title="YouTube video player"
                            frameborder="0"
                            allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
                            referrerpolicy="strict-origin-when-cross-origin"
                            allowfullscreen>
                    </iframe>
                `;
                playListList.appendChild(playListElement);
            });
        })
        .catch(error => console.error('Error fetching PlayLists:', error));
});
